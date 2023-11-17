package Tamgiac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào độ dài cạnh A: ");
        double canhA = scanner.nextDouble();

        System.out.print("Nhập vào độ dài cạnh B: ");
        double canhB = scanner.nextDouble();

        System.out.print("Nhập vào độ dài cạnh C: ");
        double canhC = scanner.nextDouble();

        TamGiac tamGiac = new TamGiac(canhA, canhB, canhC);

        if (tamGiac.laTamGiac()) {
            System.out.println("Chu vi tam giác là: " + tamGiac.tinhChuVi());
            System.out.println("Diện tích tam giác là: " + tamGiac.tinhDienTich());
        } else {
            System.out.println("Ba giá trị không tạo thành một tam giác.");
        }

        scanner.close();
    }
}
