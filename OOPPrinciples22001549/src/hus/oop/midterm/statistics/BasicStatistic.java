package hus.oop.midterm.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        dataSet = new ListDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double max = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if(max < dataSet.element(i)) max = dataSet.element(i);
        }
        return max;
    }

    @Override
    public double min() {
        double min = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if(min > dataSet.element(i)) min = dataSet.element(i);
        }
        return min;
    }

    @Override
    public double mean() {
        double sum = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            sum += dataSet.element(i);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            sum += Math.pow(dataSet.element(i) - mean, 2);
        }
        return sum / dataSet.size();
    }

    @Override
    public double[] rank() {
        // calculate rank of all element in list
        // if many element have the same rank, the rank will be the average of index of all same element
        double[] tmp = dataSet.elements(0, dataSet.size() - 1);

        //sort array
        for (int i = 0; i < tmp.length - 1; i++) {
            for (int j = i + 1; j < tmp.length; j++) {
                if(dataSet.element(i) > dataSet.element(j)) {
                    double temp = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = temp;
                }
            }
        }
        Set<Double> uniqueArr = new HashSet<Double>();
        for(int i = 0; i < dataSet.size(); i++) {
            uniqueArr.add(tmp[i]);
        }

        ArrayList<Double> sortedArr = new ArrayList<Double>(uniqueArr);

        double[] res = new double[sortedArr.size()];

        uniqueArr = new HashSet<>();
        for (int i = 0; i < dataSet.size(); i++) {
            uniqueArr.add(dataSet.element(i));
        }

        int cnt = 0;

        for(double val : uniqueArr) {
            double sum = 0;
            int numOfElement = 0;
            for (int i = 0; i < dataSet.size(); i++) {
                if(val == dataSet.element(i)) {
                    sum += i;
                    numOfElement++;
                }
            }
            if(numOfElement == 1) {
                res[cnt++] = sortedArr.indexOf(val);
            } else {
                res[cnt++] = sum / numOfElement;
            }
        }
        return res;
    }

    @Override
    public double median() {
        // calculate median of all element in list
        double[] res = dataSet.elements(0, dataSet.size() - 1);
        // sort array
        for (int i = 0; i < res.length - 1; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if(res[i] > res[j]) {
                    double temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        // get median
        if(res.length % 2 == 0) {
            return (res[res.length / 2] + res[res.length / 2 - 1]) / 2;
        } else {
            return res[res.length / 2];
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dataSet.size(); i++) {
            result.append(dataSet.element(i));
            if(i < dataSet.size() - 1) result.append(", ");
        }
        result.append("]");

        result.append("\nMax: ");
        result.append(max());
        result.append("\nMin: ");
        result.append(min());
        result.append("\nMean: ");
        result.append(mean());
        result.append("\nVariance: ");
        result.append(variance());
        result.append("\nRank: ");
        double[] rank = rank();
        for (int i = 0; i < rank.length; i++) {
            result.append(rank[i]);
            if(i < rank.length - 1) result.append(", ");
        }
        result.append("\nMedian: ");
        result.append(median());
        return result.toString();
    }
}
