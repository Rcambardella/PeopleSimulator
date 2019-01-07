import java.util.*;

class Diseases
{
List<Disease> diseases = new ArrayList<Disease>();

public Diseases(){
    diseases.add(new Disease("Cancer", 0.4, 0.06 , 0));// 22.5 percent of deaths come from Cancer
    diseases.add(new Disease("Heart Disease", 0.25, 0.10 , 0)); // 23% of total deaths come from Heart Disease
    diseases.add(new Disease("Cerebrovascular Disease", 0.3, 0.08 , 0)); // 5.6% of total deaths come from Lower Respiratory Disease
    diseases.add(new Disease("Alzheimer's Disease", 0.10, 0.14 , 0)); // 3.6% of total deaths come from Lower Respiratory Disease
    diseases.add(new Disease("Diabetes", 0.15, 0.11 , 0)); // 2.9% of total deaths come from Lower Respiratory Disease
    diseases.add(new Disease("Influenza", 0.05, 0.15 , .35)); // 2.1% of total deaths come from Lower Respiratory Disease
    diseases.add(new Disease("Kidney Disease", 0.20, 0.06 , 0)); // 1.8% of total deaths come from Lower Respiratory Disease
    diseases.add(new Disease("Suicide", 0.35, 0.25 , 0)); // 1.6% of total deaths come from Lower Respiratory Disease
}


}