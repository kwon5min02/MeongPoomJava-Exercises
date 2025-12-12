package Chp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;

public class Ex08 extends JFrame {

    // --- 클래스 멤버 변수 ---
    private Vector<ImageIcon> imageVector = new Vector<>(); // 로드된 이미지 아이콘 리스트
    private int currentImageIndex = 0; // 현재 화면에 표시된 이미지의 인덱스
    private JLabel imageLabel = new JLabel(); // 이미지를 표시할 레이블
    private JRadioButton leftButton = new JRadioButton("left");
    private JRadioButton rightButton = new JRadioButton("right");

    // 프레임 크기 설정
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 450;

    public Ex08() {
        setTitle("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // 1. 이미지 로딩
        if (!loadImages()) {
            JOptionPane.showMessageDialog(this,
                    "이미지를 로드하는 데 실패했습니다. 'images' 폴더에 .jpg 또는 .png 파일을 넣어주세요.",
                    "오류", JOptionPane.ERROR_MESSAGE);
            return; // 이미지가 없으면 실행 중단
        }

        // 2. 컴포넌트 설정 및 레이아웃 정의
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout()); // Border Layout 사용

        // 3. 라디오 버튼 패널 (NORTH 영역)
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ButtonGroup group = new ButtonGroup();

        group.add(leftButton);
        group.add(rightButton);

        rightButton.setSelected(true); // 기본값은 right (순방향)

        radioPanel.add(leftButton);
        radioPanel.add(rightButton);

        contentPane.add(radioPanel, BorderLayout.NORTH);

        // 4. 이미지 레이블 (CENTER 영역)
        // 레이블 초기 설정 (첫 번째 이미지 표시)
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setIcon(resizeIcon(imageVector.get(currentImageIndex), FRAME_WIDTH - 20, FRAME_HEIGHT - 80));

        // 마우스 리스너 등록
        imageLabel.addMouseListener(new ImageClickListener());

        contentPane.add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    private boolean loadImages() {
        // 현재 실행 위치에 있는 'images' 폴더 지정
        File imageDir = new File("images");

        if (!imageDir.exists() || !imageDir.isDirectory()) {
            System.out.println("Error: 'images' 폴더를 찾을 수 없습니다.");
            return false;
        }

        File[] files = imageDir.listFiles((dir, name) ->
                name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png"));

        if (files == null || files.length == 0) {
            System.out.println("Error: 'images' 폴더에 이미지 파일이 없습니다.");
            return false;
        }

        // 파일들을 ImageIcon으로 변환하여 Vector에 추가
        for (File file : files) {
            try {
                // 경로를 통해 ImageIcon 생성
                ImageIcon icon = new ImageIcon(file.getPath());
                imageVector.add(icon);
            } catch (Exception e) {
                System.out.println("이미지 로드 중 오류 발생: " + file.getName());
            }
        }

        return !imageVector.isEmpty();
    }


    private ImageIcon resizeIcon(ImageIcon icon, int maxWidth, int maxHeight) {
        Image img = icon.getImage();
        int originalWidth = img.getWidth(null);
        int originalHeight = img.getHeight(null);

        if (originalWidth <= 0 || originalHeight <= 0) return icon; // 유효하지 않은 이미지 크기 처리

        // 가로/세로 비율 계산
        double widthRatio = (double) maxWidth / originalWidth;
        double heightRatio = (double) maxHeight / originalHeight;

        // 두 비율 중 작은 것을 선택하여 비율 유지
        double ratio = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * ratio);
        int newHeight = (int) (originalHeight * ratio);

        // 스케일링된 이미지 생성
        Image resizedImg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }


    class ImageClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {

            int totalImages = imageVector.size();

            // 1. 탐색 방향 결정
            if (rightButton.isSelected()) {
                // 순방향 (인덱스 증가)
                currentImageIndex = (currentImageIndex + 1) % totalImages;
            } else if (leftButton.isSelected()) {
                // 역방향 (인덱스 감소)
                currentImageIndex--;
                // 인덱스가 -1이 되면 마지막 이미지로 순환
                if (currentImageIndex < 0) {
                    currentImageIndex = totalImages - 1;
                }
            }

            // 2. 새 이미지 표시
            ImageIcon nextIcon = imageVector.get(currentImageIndex);

            // 레이블의 현재 크기에 맞춰 스케일링하여 설정
            int labelWidth = imageLabel.getWidth();
            int labelHeight = imageLabel.getHeight();

            imageLabel.setIcon(resizeIcon(nextIcon, labelWidth, labelHeight));
        }
    }

    public static void main(String[] args) {
        new Ex08();
    }
}