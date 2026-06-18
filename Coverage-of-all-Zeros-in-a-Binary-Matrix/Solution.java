                        }
                    }

                    // Up
                    for (int k = i - 1; k >= 0; k--) {
                        if (mat[k][j] == 1) {
                            total++;
                            break;
                        }
                    }

                    // Down
                    for (int k = i + 1; k < n; k++) {
                        if (mat[k][j] == 1) {
                            total++;
                            break;
                        }
                    }
                }
            }
        }

        return total;
    }
}