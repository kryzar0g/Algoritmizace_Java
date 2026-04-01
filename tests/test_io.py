import numpy as np

from tremor_analyzer_work.io import read_data


def test_read_data_starts_at_zero_and_removes_invalid_rows():
    data = read_data("data/FT_10.csv")
    assert data[0, 0] == 0.0
    assert not np.any(data == -1000)
