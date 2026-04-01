from __future__ import annotations

from pathlib import Path

import numpy as np
import pandas as pd


def read_data(file_path: str | Path) -> np.ndarray:
    """Load CSV data, remove invalid rows, normalize time to start at 0.

    Expected columns: t, x1, y1, x2, y2
    """
    df = pd.read_csv(file_path)
    numeric = df.apply(pd.to_numeric, errors="coerce")
    cleaned = numeric.dropna()
    cleaned = cleaned.loc[~(cleaned == -1000).any(axis=1)].copy()

    if cleaned.empty:
        return np.empty((0, numeric.shape[1]), dtype=float)

    first_time = float(cleaned.iloc[0, 0])
    cleaned.iloc[:, 0] = cleaned.iloc[:, 0] - first_time
    return cleaned.to_numpy(dtype=float)
