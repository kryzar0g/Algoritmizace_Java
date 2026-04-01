from __future__ import annotations

from pathlib import Path

import matplotlib.pyplot as plt
import numpy as np

from .io import read_data
from .processing import velocity


def _zscore(x: np.ndarray) -> np.ndarray:
    std = float(np.std(x))
    if std == 0:
        return x - float(np.mean(x))
    return (x - float(np.mean(x))) / std


def create_figure(file_path: str | Path = "data/FT_10.csv", out_path: str | Path = "test.png") -> Path:
    data = read_data(file_path)
    if data.size == 0:
        raise ValueError("No valid data after cleaning")

    t = data[:, 0]
    mask = (t >= 2) & (t <= 7)
    d = data[mask]

    t = d[:, 0]
    x1, y1, x2, y2 = d[:, 1], d[:, 2], d[:, 3], d[:, 4]

    v1 = velocity(d[:, [0, 1, 2]])
    v2 = velocity(d[:, [0, 3, 4]])

    fig, axs = plt.subplots(2, 2, figsize=(12, 8))

    axs[0, 0].plot(x1, y1, label="Hand 1")
    axs[0, 0].plot(x2, y2, label="Hand 2")
    axs[0, 0].set_title("2D trajectory")
    axs[0, 0].set_xlabel("X")
    axs[0, 0].set_ylabel("Y")

    axs[0, 1].plot(v1[:, 0], v1[:, 1], label="velocity 1")
    axs[0, 1].plot(v2[:, 0], v2[:, 1], label="velocity 2")
    axs[0, 1].set_title("Velocity in time")
    axs[0, 1].set_xlabel("Time [s]")
    axs[0, 1].set_ylabel("Velocity")

    axs[1, 0].plot(t, _zscore(x1), label="X1")
    axs[1, 0].plot(t, _zscore(x2), label="X2")
    axs[1, 0].set_title("Centered/scaled X")
    axs[1, 0].set_xlabel("Time [s]")
    axs[1, 0].set_ylabel("z-score")

    axs[1, 1].plot(t, _zscore(y1), label="Y1")
    axs[1, 1].plot(t, _zscore(y2), label="Y2")
    axs[1, 1].set_title("Centered/scaled Y")
    axs[1, 1].set_xlabel("Time [s]")
    axs[1, 1].set_ylabel("z-score")

    for ax in axs.flat:
        ax.grid(True)
        ax.legend()

    fig.tight_layout()
    out = Path(out_path)
    fig.savefig(out)
    plt.show()
    return out
