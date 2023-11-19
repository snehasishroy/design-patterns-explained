package Observer;

import java.util.UUID;

public class JobExecutor implements Observer<Job> {
    UUID uuid;

    public JobExecutor() {
        uuid = UUID.randomUUID();
    }

    @Override
    public void update(Job data) {
        System.out.println(uuid + " is executing jobId " + data.jobId());
    }
}
