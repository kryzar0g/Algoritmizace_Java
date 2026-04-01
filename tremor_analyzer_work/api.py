from __future__ import annotations

from pathlib import Path

from fastapi import FastAPI, HTTPException

from .io import read_data
from .processing import mean_velocity

app = FastAPI(title="TremorAnalyzer")


@app.get("/")
def root() -> dict[str, str]:
    return {"app": "TremorAnalyzer", "status": "ok"}


@app.get("/analyze/{patient_id}")
def analyze(patient_id: str) -> dict[str, str | float]:
    file_path = Path("data") / f"{patient_id}.csv"
    if not file_path.exists():
        raise HTTPException(status_code=404, detail="Patient data file not found")

    data = read_data(file_path)
    if data.shape[1] < 5:
        raise HTTPException(status_code=400, detail="Unexpected data format")

    m1, m2 = mean_velocity(data)
    return {
        "patient": patient_id,
        "mean_vel1": round(m1, 4),
        "mean_vel2": round(m2, 4),
        "status": "success",
    }
