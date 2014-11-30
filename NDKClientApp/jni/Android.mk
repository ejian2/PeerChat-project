LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := Chat
LOCAL_SRC_FILES := Chat.cpp

include $(BUILD_SHARED_LIBRARY)
