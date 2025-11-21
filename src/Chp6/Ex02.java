package Chp6;

import java.util.Objects;

class Circle {
    int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle (" + x + ", " + y + ", " + r + ") 반지름 " + r;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. 자기 자신과의 비교 (주소가 같으면 당연히 true)
        if (this == obj) return true;

        // 2. null이거나 클래스 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Circle로 캐스팅(형변환) 후 필드값 비교
        Circle point = (Circle) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);

        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);

        if (a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
