import java.util.*;

public class EmployeeImportance {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };

    public int getImportance(List<Employee> employees, int id){

        Map<Integer, Employee> emap = new HashMap<>();


       for(Employee e: employees){emap.put(e.id, e);}


        Queue<Employee> q = new LinkedList<>();
        Employee e = emap.get(id);

        q.add(e);

        int result = 0;

        result += e.importance;

        while(!q.isEmpty()){

            e = q.poll();

            if(!e.subordinates.isEmpty()){

            for(int sub: e.subordinates){
                e = emap.get(sub);
                result += e.importance;
                q.add(e);
            }}

        }

        return result;
    }

    }

