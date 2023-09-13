package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Course)) return false;
        if (!super.equals(object)) return false;
        Course course = (Course) object;
        return java.util.Objects.equals(topic, course.topic) && java.util.Objects.equals(instructor, course.instructor) && java.util.Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), topic, instructor, enrolledStudents);
    }
}
