package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FunctionCalculator extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Label Task7 = new Label("Задание №7");
        Task7.setAlignment(Pos.CENTER);

        // Создаем компоненты интерфейса
        Label xLabel = new Label("Введите x:");
        TextField xTextField = new TextField();

        Label yLabel = new Label("Введите y:");
        TextField yTextField = new TextField();

        Button calculateButton = new Button("Вычислить");
        Label resultLabel = new Label("Результат:");

        calculateButton.setOnAction(event -> {
            try {
                double x = Double.parseDouble(xTextField.getText());
                double y = Double.parseDouble(yTextField.getText());
                double z = Math.log(x - y) - (x / y);
                resultLabel.setText("Результат: " + z);
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка ввода чисел.");
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль.");
            }
        });

        Label Task10 = new Label("Задание №10");
        Task10.setAlignment(Pos.CENTER);

        Label aLabel = new Label("A:");
        TextField aTextField = new TextField();

        Label bLabel = new Label("B:");
        TextField bTextField = new TextField();

        Label cLabel = new Label("C:");
        TextField cTextField = new TextField();

        Button printButton = new Button("Вывести переменные");

        Label resultLabel2 = new Label("Результат:");


        printButton.setOnAction(event -> {
            try {
                // Получаем значения переменных
                double a = Double.parseDouble(aTextField.getText());
                double b = Double.parseDouble(bTextField.getText());
                double c = Double.parseDouble(cTextField.getText());

                // Сортируем переменные в порядке возрастания
                double[] sortedVariables = {a, b, c};
                java.util.Arrays.sort(sortedVariables);

                // Выводим переменные в порядке возрастания
                resultLabel2.setText("Результат: " + sortedVariables[0] + ", " + sortedVariables[1] + ", " + sortedVariables[2]);
            } catch (NumberFormatException e) {
                resultLabel2.setText("Ошибка ввода чисел.");
            }
        });

        Label Task13 = new Label("Задание №13");
        Task10.setAlignment(Pos.CENTER);

        // Создаем компоненты интерфейса
        Label ALabel = new Label("A (x1, y1):");
        TextField x1TextField = new TextField();
        TextField y1TextField = new TextField();

        Label BLabel = new Label("B (x2, y2):");
        TextField x2TextField = new TextField();
        TextField y2TextField = new TextField();

        Label CLabel = new Label("C (x3, y3):");
        TextField x3TextField = new TextField();
        TextField y3TextField = new TextField();

        Button checkButton = new Button("Проверить существование треугольника");

        Label resultLabel3 = new Label("Результат:");

        checkButton.setOnAction(event -> {
            try {
                double x1 = Double.parseDouble(x1TextField.getText());
                double y1 = Double.parseDouble(y1TextField.getText());
                double x2 = Double.parseDouble(x2TextField.getText());
                double y2 = Double.parseDouble(y2TextField.getText());
                double x3 = Double.parseDouble(x3TextField.getText());
                double y3 = Double.parseDouble(y3TextField.getText());

                double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

                if (area > 0) {
                    resultLabel3.setText("Результат: Треугольник существует.");
                } else {
                    resultLabel3.setText("Результат: Треугольник не существует.");
                }
            } catch (NumberFormatException e) {
                resultLabel3.setText("Ошибка ввода координат.");
            }
        });


        Label Task16 = new Label("Задание №16");
        Task10.setAlignment(Pos.CENTER);

        Label squareAreaLabel = new Label("Площадь квадрата (S1):");
        TextField squareAreaTextField = new TextField();

        Label circleAreaLabel = new Label("Площадь круга (S2):");
        TextField circleAreaTextField = new TextField();

        Button checkButton2 = new Button("Проверить помещение");

        Label resultLabel4 = new Label();

        checkButton.setOnAction(event -> {
            try {
                double s1 = Double.parseDouble(squareAreaTextField.getText());
                double s2 = Double.parseDouble(circleAreaTextField.getText());

                double sideLength = Math.sqrt(s1);
                double radius = Math.sqrt(s2 / Math.PI);

                if (radius <= sideLength / 2) {
                    resultLabel.setText("Круг помещается в квадрат.");
                } else if (sideLength <= radius * 2) {
                    resultLabel.setText("Квадрат помещается в круг.");
                } else {
                    resultLabel.setText("Круг и квадрат не помещаются друг в друга.");
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка ввода площадей.");
            }
        });

        Label Task19 = new Label("Задание №19");
        Task10.setAlignment(Pos.CENTER);

        Label a_Label = new Label("Сторона A:");
        TextField a_TextField = new TextField();

        Label b_Label = new Label("Сторона B:");
        TextField b_TextField = new TextField();

        Label c_Label = new Label("Сторона C:");
        TextField c_TextField = new TextField();

        Label dLabel = new Label("Сторона D:");
        TextField dTextField = new TextField();

        Button checkButton3 = new Button("Проверить умещение");

        Label resultLabel5 = new Label();

        // Создаем обработчик события нажатия на кнопку "Проверить умещение"
        checkButton.setOnAction(event -> {
            try {
                double a = Double.parseDouble(aTextField.getText());
                double b = Double.parseDouble(bTextField.getText());
                double c = Double.parseDouble(cTextField.getText());
                double d = Double.parseDouble(dTextField.getText());

                if ((a <= c && b <= d) || (a <= d && b <= c)) {
                    resultLabel.setText("Прямоугольник AxB умещается внутри CxD.");
                } else {
                    resultLabel.setText("Прямоугольник AxB не умещается внутри CxD.");
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка ввода сторон.");
            }
        });


        ScrollPane scrollPane = new ScrollPane();
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(Task7,xLabel, xTextField, yLabel, yTextField, calculateButton, resultLabel,
                Task10,aLabel, aTextField, bLabel, bTextField, cLabel, cTextField, printButton, resultLabel2,
                Task13,ALabel, x1TextField, y1TextField,
                BLabel, x2TextField, y2TextField,
                CLabel, x3TextField, y3TextField,
                checkButton, resultLabel3,
                Task16,squareAreaLabel, squareAreaTextField,
                circleAreaLabel, circleAreaTextField,
                checkButton2, resultLabel4,
                Task19,a_Label, a_TextField,
                b_Label, b_TextField,
                c_Label, c_TextField,
                dLabel, dTextField,
                checkButton3, resultLabel5);

        scrollPane.setContent(layout);
        Scene scene = new Scene(scrollPane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}