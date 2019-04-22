LOCAL_PATH       :=  $(call my-dir)


include              $(CLEAR_VARS)


LOCAL_MODULE     :=  hi_jni


LOCAL_SRC_FILES  :=  hi.cpp

include              $(BUILD_SHARED_LIBRARY)