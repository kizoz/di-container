package classesForTests;

import com.di.Inject;

public class ClassWithManyConstructorsImpl implements ClassWithManyConstructors {

    EventDao eventDao;

    EventService eventService;

    @Inject
    public ClassWithManyConstructorsImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Inject
    public ClassWithManyConstructorsImpl(EventService eventService) {
        this.eventService = eventService;
    }
}
