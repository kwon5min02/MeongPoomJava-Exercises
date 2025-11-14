package Chp5;

abstract class PairMap {
    protected String[] keyArray; // key들을 저장하는 배열
    protected String[] valueArray; // value들을 저장하는 배열
    abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); // key와 value를 쌍으로 저장,
                                                 // key가 있으면, 값을 value로 수정
    abstract String delete(String key); // key 값을 가진 아이템(value도) 삭제, 삭제된 value 리턴
    abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap {
    int count = 0;

    public Dictionary(int i) {
        keyArray = new String[i];
        valueArray = new String[i];
    }

    @Override
    String get(String key) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < count; i++)
            if (keyArray[i].equals(key)) {
                index = i;
                found = true;
            }
        return found ? valueArray[index] : null;
    }

    @Override
    void put(String key, String value) {
        // 1. 이미 키가 있는지 확인
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value; // 키가 있으면 값만 수정하고 종료
                return;
            }
        }

        try {
            // 2. 키가 없으면 새로 추가 (배열이 꽉 찼는지 확인)
            if (count < keyArray.length) {
                keyArray[count] = key;
                valueArray[count] = value;
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열이 꽉 찼습니다.");
        }

    }

    @Override
    String delete(String key) {
        int index = -1; // 삭제할 요소의 인덱스

        // 1. 삭제할 키의 인덱스 찾기
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) {
                index = i;
                break; // 찾았으면 반복 중단
            }
        }

        // 2. 키를 못 찾았으면 null 리턴
        if (index == -1) {
            return null;
        }

        // 3. 키를 찾았으면
        String deletedValue = valueArray[index]; // 삭제될 값 저장

        // 4. 삭제된 위치(index)부터 (count - 1)까지 뒤의 요소들을 한 칸씩 앞으로 당김
        for (int i = index; i < count - 1; i++) {
            keyArray[i] = keyArray[i + 1];
            valueArray[i] = valueArray[i + 1];
        }

        // 5. count를 1 줄이고, 마지막으로 남은 데이터를 null로 처리 (메모리 누수 방지)
        count--;
        keyArray[count] = null;
        valueArray[count] = null;

        return deletedValue; // 삭제된 값 리턴
    }

    @Override
    int length() {
        return count;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(10);
        dictionary.put("황기태", "자바");
        dictionary.put("이재문", "파이썬");
        dictionary.put("이재문", "C++");


        System.out.println("이재문의 값은 " + dictionary.get("이재문"));
        System.out.println("황기태의 값은 " + dictionary.get("황기태"));

        dictionary.delete("황기태");
        System.out.println("황기태의 값은 " + dictionary.get("황기태"));

    }
}
