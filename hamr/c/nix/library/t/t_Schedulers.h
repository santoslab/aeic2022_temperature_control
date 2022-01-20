#ifndef SIREUM_H_t_Schedulers
#define SIREUM_H_t_Schedulers

#ifdef __cplusplus
extern "C" {
#endif

#include <types.h>

void t_Schedulers_init(STACK_FRAME_ONLY);

t_ProcessorTimingProperties t_Schedulers_TempControlSystem_i_Instance_t_processor_timingProperties(STACK_FRAME_ONLY);
t_ThreadTimingProperties t_Schedulers_TempControlSystem_i_Instance_tsp_tempSensor_timingProperties(STACK_FRAME_ONLY);
t_ThreadTimingProperties t_Schedulers_TempControlSystem_i_Instance_tcp_tempControl_timingProperties(STACK_FRAME_ONLY);
t_ThreadTimingProperties t_Schedulers_TempControlSystem_i_Instance_fp_fan_timingProperties(STACK_FRAME_ONLY);
IS_7E8796 t_Schedulers_roundRobinSchedule(STACK_FRAME_ONLY);
Z t_Schedulers_framePeriod(STACK_FRAME_ONLY);
Z t_Schedulers_numComponents(STACK_FRAME_ONLY);
Z t_Schedulers_maxExecutionTime(STACK_FRAME_ONLY);
art_scheduling_static_Schedule_DScheduleSpec t_Schedulers_staticSchedule(STACK_FRAME_ONLY);

void t_Schedulers_getRoundRobinScheduler(STACK_FRAME art_scheduling_roundrobin_RoundRobin result, Option_E65AA5 schedule);

void t_Schedulers_getStaticScheduler(STACK_FRAME art_scheduling_static_StaticScheduler result, Option_188779 schedule);

void t_Schedulers_getLegacyScheduler(STACK_FRAME art_scheduling_legacy_Legacy result);

void t_Schedulers_init_TempControlSystem_i_Instance_t_processor_timingProperties(STACK_FRAME_ONLY);

void t_Schedulers_init_TempControlSystem_i_Instance_tsp_tempSensor_timingProperties(STACK_FRAME_ONLY);

void t_Schedulers_init_TempControlSystem_i_Instance_tcp_tempControl_timingProperties(STACK_FRAME_ONLY);

void t_Schedulers_init_TempControlSystem_i_Instance_fp_fan_timingProperties(STACK_FRAME_ONLY);

void t_Schedulers_init_roundRobinSchedule(STACK_FRAME_ONLY);

void t_Schedulers_init_framePeriod(STACK_FRAME_ONLY);

void t_Schedulers_init_numComponents(STACK_FRAME_ONLY);

void t_Schedulers_init_maxExecutionTime(STACK_FRAME_ONLY);

void t_Schedulers_init_staticSchedule(STACK_FRAME_ONLY);

#ifdef __cplusplus
}
#endif

#endif