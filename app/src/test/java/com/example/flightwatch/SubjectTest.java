/*
 * SubjectTest
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;

import junit.framework.TestCase;

public class SubjectTest extends TestCase {

    Subject subject;
    Observer observer;

    /* Test Methods */
    public void testRegisterRemoveObserver(){
        subject.registerObserver(observer);
        subject.removeObserver(observer);
        assertNull(subject);
    }

    public void testNotifyObserver(){
        subject.registerObserver(observer);
        subject.notifyObserver("all","Hamburg");
    }

}