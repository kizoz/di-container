package com.di;

public class MyMain {

    public static void main(String[] args) {

        Injector injector = new InjectorImpl();
        injector.bind(ServiceB.class, ServiceBimpl.class);
        injector.bind(ServiceC.class, ServiceCimpl.class);
        injector.bind(Serv.class, ServiceA.class);
        try {
            injector.bindSingleton(ServiceX.class, ServiceXImpl.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Provider<Serv> serviceXProvider = injector.getProvider(Serv.class);
            Serv serviceA = serviceXProvider.getInstance();
            serviceA.met();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

interface Serv{
    void met();
}

class ServiceA implements Serv{

    public ServiceB serviceB;

    public ServiceX serviceX;

    @Inject
    public ServiceA(ServiceB serviceB, ServiceX serviceX) {
        this.serviceB = serviceB;
        this.serviceX = serviceX;
    }

    public void met(){
        serviceB.met();
    }
}

interface ServiceX{
    void mer();
}

class ServiceXImpl implements ServiceX {

    public ServiceXImpl() {
    }

    @Override
    public void mer() {
        System.out.println("BUHIIII");
    }
}

interface ServiceB{

    void met();
}

class ServiceBimpl implements ServiceB {

    ServiceC serviceC;
/*

    public ServiceBimpl(){
    }

    @Inject
    public ServiceBimpl(ServiceC serviceC) {
        this.serviceC = serviceC;
    }
*/

    public void met() {
        System.out.println("FFFFFFF");
    }
}

interface ServiceC{

    void met();
}

class ServiceCimpl implements ServiceC {

    public ServiceCimpl() {
    }

    public void met() {
        System.out.println("WORK");
    }
}


