/**
     *
     * @param vector2 второй вектор
     * @return сумму векторов
     */
    public Vector vectorSum(Vector vector2) {
        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }

    /**
     *
     * @param vector2 второй вектор
     * @return разницу векторов
     */
    public Vector vectorRazn(Vector vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }