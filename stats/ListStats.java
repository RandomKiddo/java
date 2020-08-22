import java.util.*;
public class ListStats extends Statistics{
    //Max Methods
    public static int maxInt(ArrayList<Integer> dataset){
        int max = dataset.get(0);
        for(Integer val : dataset){
            if (val > max){
                max = val;
            }
        }
        return max;
    }
    public static double maxDouble(ArrayList<Double> dataset){
        double max = dataset.get(0);
        for(Double val : dataset){
            if (val > max){
                max = val;
            }
        }
        return max;
    }
    //Min Methods
    public static int minInt(ArrayList<Integer> dataset){
        int min = dataset.get(0);
        for (Integer val : dataset){
            if (val < min){
                min = val;
            }
        }
        return min;
    }
    public static double minDouble(ArrayList<Double> dataset){
        double min = dataset.get(0);
        for (Double val : dataset){
            if (val < min){
                min = val;
            }
        }
        return min;
    }
    //Mean Methods
    public static double meanInt(ArrayList<Integer> dataset){
        int sum = 0, terms = 0;
        for (Integer val : dataset){
            sum += val;
            terms++;
        }
        return (double)sum / (double)terms;
    }
    public static double meanDouble(ArrayList<Double> dataset){
        double sum = 0.0; int terms = 0;
        for (Double val : dataset){
            sum += val;
            terms++;
        }
        return sum / (double)terms;
    }
    //Range Methods
    public static int rangeInt(ArrayList<Integer> dataset){
        return maxInt(dataset) - minInt(dataset);
    }
    public static double rangeDouble(ArrayList<Double> dataset){
        return maxDouble(dataset) - minDouble(dataset);
    }
    //Variance Methods
    public static double varianceInt(ArrayList<Integer> dataset){
        double sum = 0.0; int terms = 0;
        for (Integer val : dataset){
            sum += Math.pow(val-meanInt(dataset),2);
            terms++;
        }
        return sum / (double)terms;
    }
    public static double varianceDouble(ArrayList<Double> dataset){
        double sum = 0.0; int terms = 0;
        for (Double val : dataset){
            sum += Math.pow(val-meanDouble(dataset),2);
            terms++;
        }
        return sum / (double)terms;
    }
    //Standard Deviation Methods
    public static double standardDeviationInt(ArrayList<Integer> dataset){
        return Math.sqrt(varianceInt(dataset));
    }
    public static double standardDeviationDouble(ArrayList<Double> dataset){
        return Math.sqrt(varianceDouble(dataset));
    }
    //Median Methods
    public static double medianInt(ArrayList<Integer> dataset){
        ArrayList<Integer> sorted = dataset;
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
    public static double medianDouble(ArrayList<Double> dataset){
        ArrayList<Double> sorted = dataset;
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
    //Mode Methods
    public static List modeInt(ArrayList<Integer> dataset){
        List nums = new ArrayList();
        for (Integer val : dataset){
            nums.add(val);
        }
        Collections.sort(nums);
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
    public static List modeDouble(ArrayList<Double> dataset){
        List nums = new ArrayList();
        for (Double val : dataset){
            nums.add(val);
        }
        Collections.sort(nums);
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