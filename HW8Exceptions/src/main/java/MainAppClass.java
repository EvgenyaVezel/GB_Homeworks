public class MainAppClass {

    public static final int MASSIZE = 4;

    public static void main(String[] args) {

        try {
            System.out.println(masString(new String[4][4]));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива должен быть 4х4");
        }
        catch (MyArrayDataException e){
            System.out.println("В ячейке[" + e.i + "] [" + e.j + "] не удалось преобразовать строку в число");

        }

    }

    static int masString(String[][] textMas) throws MyArraySizeException, MyArrayDataException{
        int sumMas = 0;
        if(textMas.length !=MASSIZE || textMas[0].length != MASSIZE){
            throw new MyArraySizeException();
        }
        else {
            for (int i = 0; i < textMas.length; i++) {//заполняем элементы массива String
                for (int j = 0; j < textMas[0].length; j++) {
                    textMas[i][j] = String.valueOf(i+j);
                }
            }
            textMas[3][2] = "ha-ha3";//добавляем то, что нельзя преобразовать в int

            for (int i = 0; i < textMas.length; i++) {//Выводим массив

                for (int j = 0; j < textMas[0].length; j++) {
                    StringBuilder sb = new StringBuilder(textMas[i][j]);
                    System.out.print(sb.append(", "));
                }
                System.out.println();
            }


            for (int i = 0; i < textMas.length; i++) {//Суммируем массив
                for (int j = 0; j < textMas[0].length; j++) {

                    try {
                        sumMas += Integer.parseInt(textMas[i][j]);

                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }

                }
                System.out.println();
            }
        }
        return  sumMas;
    }


}


