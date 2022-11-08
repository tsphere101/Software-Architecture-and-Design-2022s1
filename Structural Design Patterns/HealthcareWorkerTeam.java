package structural;

import java.util.Set;
import java.util.HashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members ;

    public HealthcareWorkerTeam() {
        members = new HashSet<>();
    }

    public void addMember(HealthcareServiceable worker) {
        members.add(worker);
    }

    public void removeMember(HealthcareWorker worker) {
        members.remove(worker);
    }

    @Override
    public void service() {
        for (HealthcareServiceable worker : members) {
            worker.service();
        }
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (HealthcareServiceable worker : members) {
            total += worker.getPrice();
        }
        return total;
    }
}
