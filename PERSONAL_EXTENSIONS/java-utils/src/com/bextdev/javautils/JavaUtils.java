package com.bextdev.javautils;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

public class JavaUtils extends AndroidNonvisibleComponent {

  public JavaUtils(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public String RunJava(String java, String text, int number, int number2) {
    if (java.equals("System.out.println" + text)) {
      System.out.println(text);
      return text;
    } else if (java.equals("Math.max(" + number + "," + number2 + ")")) {
      int max = Math.max(number, number2);
      return Integer.toString(max);
    } else if (java.equals("Math.min(" + number + "," + number2 + ")")) {
      int min = Math.min(number, number2);
      return Integer.toString(min);
    } else if (java.equals("Math.sqrt(" + number + ")")) {
      double sqrt = Math.sqrt(number);
      return Double.toString(sqrt);
    } else if (java.equals("boolean " + text + " = true;")) {
      boolean isTrue = true;
      return Boolean.toString(isTrue);
    } else if (java.equals("boolean " + text + " = false;")) {
      boolean isTrue = false;
      return Boolean.toString(isTrue);
    }
    return null;
  }
}

