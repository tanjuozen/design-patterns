package com.tanju.designpatterns.creational.singleton;

import org.junit.After;
import org.junit.Test;

import java.util.concurrent.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTests {

    private ExecutorService executorService;

    @Test
    public void testSingletonWithMultiThreads() throws ExecutionException, InterruptedException {
        executorService = Executors.newFixedThreadPool(2);
        Future<String> submitFoo = executorService.submit(new ThreadFoo());
        Future<String> submitBar = executorService.submit(new ThreadBar());

        assertThat(submitFoo.get()).isEqualTo("FOO");
        assertThat(submitBar.get()).isEqualTo("FOO");
    }

    @After
    public void tearDown() {
        executorService.shutdown();
    }

    private class ThreadFoo implements Callable<String> {

        @Override
        public String call() {
            Singleton singleton = Singleton.getInstance("FOO");
            return singleton.getValue();
        }
    }

    private class ThreadBar implements Callable<String> {

        @Override
        public String call() {
            Singleton singleton = Singleton.getInstance("BAR");
            return singleton.getValue();
        }
    }
}


