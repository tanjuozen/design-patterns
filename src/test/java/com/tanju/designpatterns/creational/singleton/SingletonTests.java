package com.tanju.designpatterns.creational.singleton;

import org.junit.Test;

import java.util.concurrent.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTests {

    @Test
    public void testSingletonWithMultiThreads() throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submitFoo = executorService.submit(new ThreadFoo());
        Future<String> submitBar = executorService.submit(new ThreadBar());

        assertThat(submitFoo.get()).isEqualTo("FOO");
        assertThat(submitBar.get()).isEqualTo("FOO");
    }

    private class ThreadFoo implements Callable<String> {

        @Override
        public String call() throws Exception {
            Singleton singleton = Singleton.getInstance("FOO");
            return singleton.getValue();
        }
    }

    private class ThreadBar implements Callable<String> {

        @Override
        public String call() throws Exception {
            Singleton singleton = Singleton.getInstance("BAR");
            return singleton.getValue();
        }
    }
}


