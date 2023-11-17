package Tamgiac;

public class TamGiac {
    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public boolean laTamGiac() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    public double tinhChuVi() {
        return canhA + canhB + canhC;
    }

    public double tinhDienTich() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }
}
