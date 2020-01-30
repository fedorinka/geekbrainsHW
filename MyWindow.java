package ru.geekbrains.hw;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame{
    private static int BUTTONS_NUM = 6;
    private static int WIDTH = 800;
    private static int HEIGHT  = 500;
    private JButton[] jbs;

    MyWindow() {
        setTitle("Привет, я окно c кнопками!"); // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии окна программа завершается
        //setSize(800, 500); // размеры окна
        //setLocationRelativeTo(null); // позиция на экране
        setBounds(350, 150, WIDTH, HEIGHT); //позиция левого верхнего угла и размеры окна в пикселях

        //разные способы расположения кнопок:
        //setButtons(BUTTONS_NUM, new BorderLayout());
        //setButtons(BUTTONS_NUM, new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        //setButtons(BUTTONS_NUM, new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        //setButtons(BUTTONS_NUM + 4, new FlowLayout());
        //setButtons(BUTTONS_NUM + 4, new GridLayout(3,4));
        setButtons(BUTTONS_NUM);
        setVisible(true); // сделать видимым
    }

    MyWindow(String textFieldString) {
        setTitle("Привет, я окно с текстовым полем!"); // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии окна программа завершается
        setBounds(400, 200, WIDTH, HEIGHT); //позиция левого верхнего угла и размеры окна в пикселях

        JTextField textField = new  JTextField(textFieldString);
        Font font = new Font("Times New Roman", Font.ITALIC, 12);
        textField.setFont(font);
        textField.setSelectedTextColor(Color.RED);
        setLayout(new BorderLayout());
        add(textField);
        //добавляем обработку нажатия Enter в текстовом поле
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("В текстовое поле был введен текст: " + textField.getText());
            }
        });
        setVisible(true); // сделать видимым
    }

    MyWindow(String[] textFieldStrings) {
        setTitle("Привет, я окно с многострочным текстовым полем!"); // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии окна программа завершается
        setBounds(450, 250, WIDTH, HEIGHT); //позиция левого верхнего угла и размеры окна в пикселях

        JTextArea textArea = new  JTextArea();
        JScrollPane scrollPane = new JScrollPane();
        JRadioButton radioButton = new JRadioButton();
        radioButton.setLabel("Имя радио-кнопки");

        JCheckBox checkBox = new JCheckBox();
        checkBox.setLocation(150,150);
        checkBox.setLabel("Имя для чекбокса");

        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        textArea.setFont(font);
        textArea.setBounds(10,10,300,200);

        textArea.setText(textFieldStrings[0]);

        //textArea.setComponentPopupMenu(te);
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(radioButton,BorderLayout.PAGE_END);
        add(scrollPane, BorderLayout.LINE_END);
        add(checkBox, BorderLayout.LINE_START);
        setVisible(true); // сделать видимым
    }

    private JLabel setLabel(String labelText){
        Dimension labelSize = new Dimension(80, 80);
        Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 0);
        Font font = new Font("Verdana", Font.BOLD, 12);

        JLabel label = new JLabel(labelText);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(labelSize);
        label.setBorder(solidBorder);
        label.setFont(font);
        label.setForeground(Color.RED);

        return label;
    }

    private void setButtons(int buttonsNum, BorderLayout borderLayout) {
        JButton[] jbs = new JButton[buttonsNum];
        for(int i = 0; i < buttonsNum; i++){
            jbs[i] = new JButton("Кнопка № " + i);
            jbs[i].setBackground(Color.getHSBColor(5.2f, 15.5f,100f));//задание базового цвета ()
        }
        setLayout(borderLayout);
        //задание кнопок по сторонам света
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);

        jbs[3].setBackground(Color.ORANGE);  //изменение цвета кнопки
        //два способа расположить кнопку вверху экрана
        add(jbs[3], BorderLayout.NORTH);
        //add(jbs[3], BorderLayout.PAGE_START);

        //одна из кнопок перекрывает другую, если расположить в одном и том же месте
        add(jbs[4], BorderLayout.CENTER);
        jbs[5].setPreferredSize(new Dimension(260, 10));
        jbs[5].setBackground(Color.RED);
        //варианты расположения кнопок на окне
        //add(jbs[5], BorderLayout.PAGE_START);
        //add(jbs[5], BorderLayout.LINE_START);
        add(jbs[5], BorderLayout.LINE_END);
        //add(jbs[5], BorderLayout.PAGE_END);
    }

    private void setButtons(int buttonsNum, BoxLayout boxLayout) {
        setLayout(boxLayout);
        JButton[] jbs = new JButton[buttonsNum];
        for(int i = 0; i < buttonsNum; i++){
            jbs[i] = new JButton("Кнопка № " + i);
            jbs[i].setBackground(Color.getHSBColor(150f, 50f,50f));//задание базового цвета ()
            jbs[i].setPreferredSize(new Dimension(100, 50));
            jbs[i].setAlignmentY(CENTER_ALIGNMENT);
            jbs[i].setAlignmentX(LEFT_ALIGNMENT);
            add(jbs[i]);
        }

    }

    private void setButtons(int buttonsNum, FlowLayout flowLayout) {
        setLayout(flowLayout);
        JButton[] jbs = new JButton[buttonsNum];
        for(int i = 0; i < buttonsNum; i++){
            jbs[i] = new JButton("Кнопка № " + i);
            jbs[i].setBackground(Color.getHSBColor(150f, 50f,50f));//задание базового цвета ()
            jbs[i].setPreferredSize(new Dimension(150, 50));
            add(jbs[i]);
        }
    }

    private void setButtons(int buttonsNum, GridLayout gridLayout){
        setLayout(gridLayout);
        JButton[] jbs = new JButton[buttonsNum];
        for(int i = 0; i < buttonsNum; i++){
            jbs[i] = new JButton("Кнопка № " + i);
            jbs[i].setBackground(Color.getHSBColor(150f, 50f,50f));//задание базового цвета ()
            jbs[i].setPreferredSize(new Dimension(150, 50));
            add(jbs[i]);
        }
    }

    private void setButtons(int buttonsNum){
        setLayout(null);
        JButton[] jbs = new JButton[buttonsNum];
        //расположим кнопки по-диагонали
        int x = 0;
        int y = 0;
        int width = (WIDTH-10)/buttonsNum;
        int height = (HEIGHT-35)/buttonsNum;

        for(int i = 0; i < buttonsNum; i++){
            JButton button = jbs[i] = new JButton();
            button.setBackground(Color.getHSBColor(150f, 50f,50f));//задание базового цвета ()
            button.setBounds(x, y, width, height);
            button.add(setLabel("Кнопка № " + i));
            add(button);
            x += width;
            y += height;
            //добавим обработчик клика по кнопке, чтобы в результате нажатая кнопка меняла цвет
            button.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 button.setBackground(Color.WHITE);
             }
            });
        }

    }



}
