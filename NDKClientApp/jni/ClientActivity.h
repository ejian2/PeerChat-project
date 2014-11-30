/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_eric_ndkapp_ClientActivity */

#ifndef _Included_com_eric_ndkapp_ClientActivity
#define _Included_com_eric_ndkapp_ClientActivity
#ifdef __cplusplus
extern "C" {
#endif
#undef com_eric_ndkapp_ClientActivity_BIND_ABOVE_CLIENT
#define com_eric_ndkapp_ClientActivity_BIND_ABOVE_CLIENT 8L
#undef com_eric_ndkapp_ClientActivity_BIND_ADJUST_WITH_ACTIVITY
#define com_eric_ndkapp_ClientActivity_BIND_ADJUST_WITH_ACTIVITY 128L
#undef com_eric_ndkapp_ClientActivity_BIND_ALLOW_OOM_MANAGEMENT
#define com_eric_ndkapp_ClientActivity_BIND_ALLOW_OOM_MANAGEMENT 16L
#undef com_eric_ndkapp_ClientActivity_BIND_AUTO_CREATE
#define com_eric_ndkapp_ClientActivity_BIND_AUTO_CREATE 1L
#undef com_eric_ndkapp_ClientActivity_BIND_DEBUG_UNBIND
#define com_eric_ndkapp_ClientActivity_BIND_DEBUG_UNBIND 2L
#undef com_eric_ndkapp_ClientActivity_BIND_IMPORTANT
#define com_eric_ndkapp_ClientActivity_BIND_IMPORTANT 64L
#undef com_eric_ndkapp_ClientActivity_BIND_NOT_FOREGROUND
#define com_eric_ndkapp_ClientActivity_BIND_NOT_FOREGROUND 4L
#undef com_eric_ndkapp_ClientActivity_BIND_WAIVE_PRIORITY
#define com_eric_ndkapp_ClientActivity_BIND_WAIVE_PRIORITY 32L
#undef com_eric_ndkapp_ClientActivity_CONTEXT_IGNORE_SECURITY
#define com_eric_ndkapp_ClientActivity_CONTEXT_IGNORE_SECURITY 2L
#undef com_eric_ndkapp_ClientActivity_CONTEXT_INCLUDE_CODE
#define com_eric_ndkapp_ClientActivity_CONTEXT_INCLUDE_CODE 1L
#undef com_eric_ndkapp_ClientActivity_CONTEXT_RESTRICTED
#define com_eric_ndkapp_ClientActivity_CONTEXT_RESTRICTED 4L
#undef com_eric_ndkapp_ClientActivity_MODE_APPEND
#define com_eric_ndkapp_ClientActivity_MODE_APPEND 32768L
#undef com_eric_ndkapp_ClientActivity_MODE_ENABLE_WRITE_AHEAD_LOGGING
#define com_eric_ndkapp_ClientActivity_MODE_ENABLE_WRITE_AHEAD_LOGGING 8L
#undef com_eric_ndkapp_ClientActivity_MODE_MULTI_PROCESS
#define com_eric_ndkapp_ClientActivity_MODE_MULTI_PROCESS 4L
#undef com_eric_ndkapp_ClientActivity_MODE_PRIVATE
#define com_eric_ndkapp_ClientActivity_MODE_PRIVATE 0L
#undef com_eric_ndkapp_ClientActivity_MODE_WORLD_READABLE
#define com_eric_ndkapp_ClientActivity_MODE_WORLD_READABLE 1L
#undef com_eric_ndkapp_ClientActivity_MODE_WORLD_WRITEABLE
#define com_eric_ndkapp_ClientActivity_MODE_WORLD_WRITEABLE 2L
#undef com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_DIALER
#define com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_DIALER 1L
#undef com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_DISABLE
#define com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_DISABLE 0L
#undef com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SEARCH_GLOBAL
#define com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SEARCH_GLOBAL 4L
#undef com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SEARCH_LOCAL
#define com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SEARCH_LOCAL 3L
#undef com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SHORTCUT
#define com_eric_ndkapp_ClientActivity_DEFAULT_KEYS_SHORTCUT 2L
#undef com_eric_ndkapp_ClientActivity_RESULT_CANCELED
#define com_eric_ndkapp_ClientActivity_RESULT_CANCELED 0L
#undef com_eric_ndkapp_ClientActivity_RESULT_FIRST_USER
#define com_eric_ndkapp_ClientActivity_RESULT_FIRST_USER 1L
#undef com_eric_ndkapp_ClientActivity_RESULT_OK
#define com_eric_ndkapp_ClientActivity_RESULT_OK -1L
#undef com_eric_ndkapp_ClientActivity_HONEYCOMB
#define com_eric_ndkapp_ClientActivity_HONEYCOMB 11L
#undef com_eric_ndkapp_ClientActivity_MSG_REALLY_STOPPED
#define com_eric_ndkapp_ClientActivity_MSG_REALLY_STOPPED 1L
#undef com_eric_ndkapp_ClientActivity_MSG_RESUME_PENDING
#define com_eric_ndkapp_ClientActivity_MSG_RESUME_PENDING 2L
/*
 * Class:     com_eric_ndkapp_ClientActivity
 * Method:    nativeStartClient
 * Signature: (Ljava/lang/String;ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_eric_ndkapp_ClientActivity_nativeStartClient
  (JNIEnv *, jobject, jstring, jint, jstring);

/*
 * Class:     com_eric_ndkapp_ClientActivity
 * Method:    nativeStopClient
 * Signature: (Ljava/lang/String;ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_eric_ndkapp_ClientActivity_nativeStopClient
  (JNIEnv *, jobject, jstring, jint, jstring);

/*
 * Class:     com_eric_ndkapp_ClientActivity
 * Method:    nativeSendClient
 * Signature: (Ljava/lang/String;ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_eric_ndkapp_ClientActivity_nativeSendClient
  (JNIEnv *, jobject, jstring, jint, jstring);

#ifdef __cplusplus
}
#endif
#endif
/* Header for class com_eric_ndkapp_ClientActivity_SendClientTask */

#ifndef _Included_com_eric_ndkapp_ClientActivity_SendClientTask
#define _Included_com_eric_ndkapp_ClientActivity_SendClientTask
#ifdef __cplusplus
extern "C" {
#endif
#undef com_eric_ndkapp_ClientActivity_SendClientTask_MIN_PRIORITY
#define com_eric_ndkapp_ClientActivity_SendClientTask_MIN_PRIORITY 1L
#undef com_eric_ndkapp_ClientActivity_SendClientTask_NORM_PRIORITY
#define com_eric_ndkapp_ClientActivity_SendClientTask_NORM_PRIORITY 5L
#undef com_eric_ndkapp_ClientActivity_SendClientTask_MAX_PRIORITY
#define com_eric_ndkapp_ClientActivity_SendClientTask_MAX_PRIORITY 10L
#ifdef __cplusplus
}
#endif
#endif
/* Header for class com_eric_ndkapp_ClientActivity_StartClientTask */

#ifndef _Included_com_eric_ndkapp_ClientActivity_StartClientTask
#define _Included_com_eric_ndkapp_ClientActivity_StartClientTask
#ifdef __cplusplus
extern "C" {
#endif
#undef com_eric_ndkapp_ClientActivity_StartClientTask_MIN_PRIORITY
#define com_eric_ndkapp_ClientActivity_StartClientTask_MIN_PRIORITY 1L
#undef com_eric_ndkapp_ClientActivity_StartClientTask_NORM_PRIORITY
#define com_eric_ndkapp_ClientActivity_StartClientTask_NORM_PRIORITY 5L
#undef com_eric_ndkapp_ClientActivity_StartClientTask_MAX_PRIORITY
#define com_eric_ndkapp_ClientActivity_StartClientTask_MAX_PRIORITY 10L
#ifdef __cplusplus
}
#endif
#endif
/* Header for class com_eric_ndkapp_ClientActivity_StopClientTask */

#ifndef _Included_com_eric_ndkapp_ClientActivity_StopClientTask
#define _Included_com_eric_ndkapp_ClientActivity_StopClientTask
#ifdef __cplusplus
extern "C" {
#endif
#undef com_eric_ndkapp_ClientActivity_StopClientTask_MIN_PRIORITY
#define com_eric_ndkapp_ClientActivity_StopClientTask_MIN_PRIORITY 1L
#undef com_eric_ndkapp_ClientActivity_StopClientTask_NORM_PRIORITY
#define com_eric_ndkapp_ClientActivity_StopClientTask_NORM_PRIORITY 5L
#undef com_eric_ndkapp_ClientActivity_StopClientTask_MAX_PRIORITY
#define com_eric_ndkapp_ClientActivity_StopClientTask_MAX_PRIORITY 10L
#ifdef __cplusplus
}
#endif
#endif
