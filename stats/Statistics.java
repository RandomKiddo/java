import java.util.*;
public class Statistics{
    //Minimum Calculation Methods
    public static int min(int [] dataset){
        int min = dataset[0];
        for (int val : dataset){
            if (val < min){
                min = val;
            }
        }
        return min;
    }
    public static double min(double [] dataset){
        double min = dataset[0];
        for (double val : dataset){
            if (val < min){
                min = val;
            }
        }
        return min;
    }
    public static int min(int [][] dataset){
        int min = dataset[0][0];
        for (int [] row : dataset){
            for (int val : row){
                if (val < min){
                    min = val;
                }
            }
        }
        return min;
    }
    public static double min(double [][] dataset){
        double min = dataset[0][0];
        for (double [] row : dataset){
            for (double val : row){
                if (val < min){
                    min = val;
                }
            }
        }
        return min;
    }
    //Maximum Calculation Methods
    public static int max(int [] dataset){
        int max = dataset[0];
        for (int val : dataset){
            if (val > max){
                max = val;
            }
        }
        return max;
    }
    public static double max(double [] dataset){
        double max = dataset[0];
        for (double val : dataset){
            if (val > max){
                max = val;
            }
        }
        return max;
    }
    public static int max(int [][] dataset){
        int max = dataset[0][0];
        for (int [] row : dataset){
            for (int val : row){
                if (val > max){
                    max = val;
                }
            }
        }
        return max;
    }
    public static double max(double [][] dataset){
        double max = dataset[0][0];
        for (double [] row : dataset){
            for (double val : row){
                if (val > max){
                    max = val;
                }
            }
        }
        return max;
    }
    //Range Calculation Methods
    public static int range(int [] dataset){
        return max(dataset) - min(dataset);
    }
    public static double range(double [] dataset){
        return max(dataset) - min(dataset);
    }
    public static int range(int [][] dataset){
        return max(dataset) - min(dataset);
    }
    public static double range(double [][] dataset){
        return max(dataset) - min(dataset);
    }
    //Mean Calculation Methods
    public static double mean(int [] dataset){
        int sum = 0; int terms = 0;
        for (int val : dataset){
            sum += val;
            terms++;
        }
        return (double)sum / (double)terms;
    }
    public static double mean(double [] dataset){
        double sum = 0.0; int terms = 0;
        for (double val : dataset){
            sum += val;
            terms++;
        }
        return sum / (double)terms;
    }
    public static double mean(int [][] dataset){
        int sum = 0; int terms = 0;
        for (int [] row : dataset){
            for (int val : row){
                sum += val;
                terms++;
            }
        }
        return (double)sum / (double)terms;
    }
    public static double mean(double [][] dataset){
        double sum = 0.0; int terms = 0;
        for (double [] row : dataset){
            for (double val : row){
                sum += val;
                terms++;
            }
        }
        return sum / (double)terms;
    }
    //Variance Calculation Methods
    public static double variance(int [] dataset){
        double sum = 0.0; int terms = 0;
        for (int val : dataset){
            sum += Math.pow(val-mean(dataset),2);
            terms++;
        }
        return sum / (double)terms;
    }
    public static double variance(double [] dataset){
        double sum = 0.0; int terms = 0;
        for (double val : dataset){
            sum += Math.pow(val-mean(dataset),2);
            terms++;
        }
        return sum / (double)terms;
    }
    public static double variance(int [][] dataset){
        double sum = 0.0; int terms = 0;
        for (int [] row : dataset){
            for (int val : row){
                sum += Math.pow(val-mean(dataset),2);
                terms++;
            }
        }
        return sum / (double)terms;
    }
    public static double variance(double [][] dataset){
        double sum = 0.0; int terms = 0;
        for (double [] row : dataset){
            for (double val : row){
                sum += Math.pow(val-mean(dataset),2);
                terms++;
            }
        }
        return sum / (double)terms;
    }
    //Standard Deviation Calculation Methods
    public static double standardDeviation(int [] dataset){
        return Math.sqrt(variance(dataset));
    }
    public static double standardDeviation(double [] dataset){
        return Math.sqrt(variance(dataset));
    }
    public static double standardDeviation(int [][] dataset){
        return Math.sqrt(variance(dataset));
    }
    public static double standardDeviation(double [][] dataset){
        return Math.sqrt(variance(dataset));
    }
    //Median Calculation Methods
    public static double median(int [] dataset){
        List sorted = new ArrayList();
        for (int a = 0; a < dataset.length; a++){
            sorted.add(dataset[a]);
        }
        Collections.sort(sorted);
        if (sorted.size() % 2 != 0){
            int mid = sorted.size() / 2;
            return (int)sorted.get(mid);
        } else {
            int mid1 = sorted.size() / 2;
            int mid2 = mid1 - 1;
            double avg = ((int)sorted.get(mid1) + (int)sorted.get(mid2)) / 2.0;
            return avg;
        }
    }
    public static double median(double [] dataset){
        List sorted = new ArrayList();
        for (int a = 0; a < dataset.length; a++){
            sorted.add(dataset[a]);
        }
        Collections.sort(sorted);
        if (sorted.size() % 2 != 0){
            int mid = sorted.size() / 2;
            return (double)sorted.get(mid);
        } else {
            int mid1 = sorted.size() / 2;
            int mid2 = mid1 - 1;
            double avg = ((double)sorted.get(mid1) + (double)sorted.get(mid2)) / 2.0;
            return avg;
        }
    }
    public static double median(int [][] dataset){
        List sorted = new ArrayList();
        for (int [] row : dataset){
            for (int val : row){
                sorted.add(val);
            }
        }
        Collections.sort(sorted);
        if (sorted.size() % 2 != 0){
            int mid = sorted.size() / 2;
            return (int)sorted.get(mid);
        } else {
            int mid1 = sorted.size() / 2;
            int mid2 = mid1 - 1;
            double avg = ((int)sorted.get(mid1) + (int)sorted.get(mid2)) / 2.0;
            return avg;
        }
    }
    public static double median(double [][] dataset){
        List sorted = new ArrayList();
        for (double [] row : dataset){
            for (double val : row){
                sorted.add(val);
            }
        }
        Collections.sort(sorted);
        if (sorted.size() % 2 != 0){
            int mid = sorted.size() / 2;
            return (double)sorted.get(mid);
        } else {
            int mid1 = sorted.size() / 2;
            int mid2 = mid1 - 1;
            double avg = ((double)sorted.get(mid1) + (double)sorted.get(mid2)) / 2.0;
            return avg;
        }
    }
    //Sorting Methods For Mode
    private static List sort(int [] dataset){
        List list = new ArrayList();
        for (int val : dataset){
            list.add(val);
        }
        Collections.sort(list);
        return list;
    }
    private static List sort(double [] dataset){
        List list = new ArrayList();
        for (double val : dataset){
            list.add(val);
        }
        Collections.sort(list);
        return list;
    }
    private static List sort(int [][] dataset){
        List list = new ArrayList();
        for (int [] row : dataset){
            for (int val : row){
                list.add(val);
            }
        }
        Collections.sort(list);
        return list;
    }
    private static List sort(double [][] dataset){
        List list = new ArrayList();
        for (double [] row : dataset){
            for (double val : row){
                list.add(val);
            }
        }
        Collections.sort(list);
        return list;
    }
    //Mode Calculation Methods
    public static List mode(int [] dataset){
        List nums = sort(dataset);
        List last = new ArrayList();
        List amt = new ArrayList();
        int holder = 0, cnt = 1;
        for (int a = 1; a < nums.size(); a++){
            if ((int)nums.get(a) == (int)nums.get(a-1)){
                cnt++;
            } else {
                amt.add("" + (int)nums.get(a-1) + " " + cnt);
                cnt = 1;
            }
            holder = a;
        }
        amt.add("" + (int)nums.get(holder) + " " + cnt);
        String temp = ""; int index = 0; int max = 0, maxNum = 0, val = 0;
        List amts = new ArrayList();
        for (int b = 0; b < amt.size(); b++){
            temp = (String)amt.get(b);
            index = temp.indexOf(" ");
            amts.add(Integer.parseInt(temp.substring(index+1)));
        }
        Collections.sort(amts);
        max = (int)(amts.get(amts.size()-1));
        for (int d = 0; d < amt.size(); d++){
            temp = (String)amt.get(d);
            index = temp.indexOf(" ");
            val = Integer.parseInt(temp.substring(index+1));
            if (val == max){
                last.add(Integer.parseInt(temp.substring(0,index)));
            }
        }
        return last;
    }
    public static List mode(double [] dataset){
        List nums = sort(dataset);
        List last = new ArrayList();
        List amt = new ArrayList();
        int holder = 0, cnt = 1;
        for (int a = 1; a < nums.size(); a++){
            if ((double)nums.get(a) == (double)nums.get(a-1)){
                cnt++;
            } else {
                amt.add("" + (double)nums.get(a-1) + " " + cnt);
                cnt = 1;
            }
            holder = a;
        }
        amt.add("" + (double)nums.get(holder) + " " + cnt);
        String temp = ""; int index = 0; double max = 0, maxNum = 0, val = 0;
        List amts = new ArrayList();
        for (int b = 0; b < amt.size(); b++){
            temp = (String)amt.get(b);
            index = temp.indexOf(" ");
            amts.add(Double.parseDouble(temp.substring(index+1)));
        }
        Collections.sort(amts);
        max = (double)(amts.get(amts.size()-1));
        for (int d = 0; d < amt.size(); d++){
            temp = (String)amt.get(d);
            index = temp.indexOf(" ");
            val = Double.parseDouble(temp.substring(index+1));
            if (val == max){
                last.add(Double.parseDouble(temp.substring(0,index)));
            }
        }
        return last;
    }
    public static List mode(int [][] dataset){
        List nums = sort(dataset);
        List last = new ArrayList();
        List amt = new ArrayList();
        int holder = 0, cnt = 1;
        for (int a = 1; a < nums.size(); a++){
            if ((int)nums.get(a) == (int)nums.get(a-1)){
                cnt++;
            } else {
                amt.add("" + (int)nums.get(a-1) + " " + cnt);
                cnt = 1;
            }
            holder = a;
        }
        amt.add("" + (int)nums.get(holder) + " " + cnt);
        String temp = ""; int index = 0; int max = 0, maxNum = 0, val = 0;
        List amts = new ArrayList();
        for (int b = 0; b < amt.size(); b++){
            temp = (String)amt.get(b);
            index = temp.indexOf(" ");
            amts.add(Integer.parseInt(temp.substring(index+1)));
        }
        Collections.sort(amts);
        max = (int)(amts.get(amts.size()-1));
        for (int d = 0; d < amt.size(); d++){
            temp = (String)amt.get(d);
            index = temp.indexOf(" ");
            val = Integer.parseInt(temp.substring(index+1));
            if (val == max){
                last.add(Integer.parseInt(temp.substring(0,index)));
            }
        }
        return last;
    }
    public static List mode(double [][] dataset){
        List nums = sort(dataset);
        List last = new ArrayList();
        List amt = new ArrayList();
        int holder = 0, cnt = 1;
        for (int a = 1; a < nums.size(); a++){
            if ((double)nums.get(a) == (double)nums.get(a-1)){
                cnt++;
            } else {
                amt.add("" + (double)nums.get(a-1) + " " + cnt);
                cnt = 1;
            }
            holder = a;
        }
        amt.add("" + (double)nums.get(holder) + " " + cnt);
        String temp = ""; int index = 0; double max = 0, maxNum = 0, val = 0;
        List amts = new ArrayList();
        for (int b = 0; b < amt.size(); b++){
            temp = (String)amt.get(b);
            index = temp.indexOf(" ");
            amts.add(Double.parseDouble(temp.substring(index+1)));
        }
        Collections.sort(amts);
        max = (double)(amts.get(amts.size()-1));
        for (int d = 0; d < amt.size(); d++){
            temp = (String)amt.get(d);
            index = temp.indexOf(" ");
            val = Double.parseDouble(temp.substring(index+1));
            if (val == max){
                last.add(Double.parseDouble(temp.substring(0,index)));
            }
        }
        return last;
    }
}