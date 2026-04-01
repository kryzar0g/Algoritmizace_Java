import numpy as np

from tremor_analyzer_work.processing import mean_velocity, velocity


def test_velocity_shape_and_time_shifted():
    data = np.array(
        [
            [0.0, 0.0, 0.0],
            [1.0, 3.0, 4.0],
            [2.0, 6.0, 8.0],
        ]
    )
    v = velocity(data)
    assert v.shape == (2, 2)
    assert np.allclose(v[:, 0], [1.0, 2.0])
    assert np.allclose(v[:, 1], [5.0, 5.0])


def test_mean_velocity_two_hands():
    d = np.array(
        [
            [0.0, 0.0, 0.0, 0.0, 0.0],
            [1.0, 1.0, 0.0, 0.0, 2.0],
            [2.0, 2.0, 0.0, 0.0, 4.0],
        ]
    )
    m1, m2 = mean_velocity(d)
    assert np.isclose(m1, 1.0)
    assert np.isclose(m2, 2.0)
