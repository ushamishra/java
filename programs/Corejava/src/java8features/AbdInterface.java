package java8features;


import collection.Student;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface AbdInterface {

    public Map<Integer,Student> getStudents();
}
