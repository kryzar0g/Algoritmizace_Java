# TremorAnalyzer 2026

Python balíček pro načítání, analýzu a vizualizaci 2D tremorometrických dat.

## Instalace

```bash
pip install .
```

## Použití

```python
from tremor_analyzer_work.io import read_data
from tremor_analyzer_work.processing import mean_velocity

data = read_data("data/FT_10.csv")
print(mean_velocity(data))
```

## API

```bash
uvicorn tremor_analyzer_work.api:app --reload
```

- `GET /`
- `GET /analyze/{patient_id}`

## Vizualizace

```python
from tremor_analyzer_work.vizualizace import create_figure
create_figure("data/FT_10.csv", "test.png")
```

![result](test.png)

## Google Colab

Doplňte odkaz na vlastní Colab notebook po nahrání: `TODO`.
