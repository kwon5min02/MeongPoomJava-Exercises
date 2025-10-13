package Chp4;

// Song 클래스 작성
// 노래의 제목을 나타내는 title
// 가수를 나타내는 artist
// 노래가 발표된 연도를 나타내는 year
// 국적을 나타내는 country
// 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
// 노래 정보를 출력하는 show() 메서드
// main() 메서드에서 "1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen" 출력

class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song(){}

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Song mySong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        mySong.show();
    }
}
