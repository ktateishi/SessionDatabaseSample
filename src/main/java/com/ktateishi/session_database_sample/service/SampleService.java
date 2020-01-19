package com.ktateishi.session_database_sample.service;

import com.ktateishi.session_database_sample.model.entity.UserEntity;
import com.ktateishi.session_database_sample.model.form.UserForm;

public interface SampleService {
    UserEntity findUser(UserForm form);
}
