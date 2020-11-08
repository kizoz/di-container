package classesForTests;

import com.di.Inject;

public class EventServiceImpl implements EventService {

    EventDao eventDao;

    @Inject
    public EventServiceImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public EventDao getDao() {
        return eventDao;
    }
}
