package com.faty.example.type;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.faty.example.type.UserPermission.*;

public enum UserRole {
    ADMIN(Sets.newHashSet()),
    STUDENT(Sets.newHashSet(STUDENT_READ,STUDENT_WRITE,COURSE_READ,COURSE_WRITE));

    private Set<UserPermission> permissions;


    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions() {
        return permissions;
    }
}
