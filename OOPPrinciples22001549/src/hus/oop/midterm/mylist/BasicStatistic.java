package hus.oop.midterm.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        // Get max value
        double max = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        // Get min value
        double min = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        // Get mean value
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        // Get variance value
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            sum += (value - mean) * (value - mean);
        }
        return sum / data.size();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Max: ").append(max())
                .append("\nMin: ").append(min())
                .append("\nMean: ").append(mean())
                .append("\nVariance: ").append(variance());
        return sb.toString();
    }
}
