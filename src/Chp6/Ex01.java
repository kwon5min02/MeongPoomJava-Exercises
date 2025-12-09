package Chp6;

import java.util.Objects;

class MyPoint {
    int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        // 1. 자기 자신과의 비교 (주소가 같으면 당연히 true)
        if (this == obj) return true;

        // 2. null이거나 클래스 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. MyPoint로 캐스팅(형변환) 후 필드값 비교
        MyPoint point = (MyPoint) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class Ex01 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(3, 50);
        System.out.println(p);

        if(p.equals(q))
            System.out.println("같은점");
        else
            System.out.println("다른점");
    }
}
