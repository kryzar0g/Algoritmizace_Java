from __future__ import annotations

import numpy as np


def velocity(data: np.ndarray) -> np.ndarray:
    """Compute scalar velocity from [time, x, y] rows.

    Returns array [time_i, v_i] for i=1..n-1.
    """
    if data.shape[0] < 2:
        return np.empty((0, 2), dtype=float)

    t = data[:, 0]
    x = data[:, 1]
    y = data[:, 2]

    dt = np.diff(t)
    dx = np.diff(x)
    dy = np.diff(y)

    valid = dt != 0
    v = np.zeros_like(dt, dtype=float)
    v[valid] = np.sqrt(dx[valid] ** 2 + dy[valid] ** 2) / dt[valid]

    return np.column_stack((t[1:], v))


def mean_velocity(data: np.ndarray) -> tuple[float, float]:
    """Return mean velocity for both hands from [t, x1, y1, x2, y2]."""
    if data.size == 0:
        return (0.0, 0.0)

    v1 = velocity(data[:, [0, 1, 2]])
    v2 = velocity(data[:, [0, 3, 4]])

    m1 = float(np.mean(v1[:, 1])) if v1.size else 0.0
    m2 = float(np.mean(v2[:, 1])) if v2.size else 0.0
    return (m1, m2)
