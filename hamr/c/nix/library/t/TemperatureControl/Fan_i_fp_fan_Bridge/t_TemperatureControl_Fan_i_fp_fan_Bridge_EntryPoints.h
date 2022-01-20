#ifndef SIREUM_H_t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints
#define SIREUM_H_t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints

#ifdef __cplusplus
extern "C" {
#endif

#include <types.h>

// t.TemperatureControl.Fan_i_fp_fan_Bridge.EntryPoints

#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_Fan_i_fp_fan_BridgeId_(this) ((this)->Fan_i_fp_fan_BridgeId)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_fanCmd_Id_(this) ((this)->fanCmd_Id)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_fanAck_Id_(this) ((this)->fanAck_Id)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_dispatchTriggers_(this) ((Option_9AF35E) &(this)->dispatchTriggers)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_initialization_api_(this) ((t_TemperatureControl_Fan_i_Initialization_Api) &(this)->initialization_api)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_operational_api_(this) ((t_TemperatureControl_Fan_i_Operational_Api) &(this)->operational_api)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_dataInPortIds_(this) ((IS_82ABD8) &(this)->dataInPortIds)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_eventInPortIds_(this) ((IS_82ABD8) &(this)->eventInPortIds)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_dataOutPortIds_(this) ((IS_82ABD8) &(this)->dataOutPortIds)
#define t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_eventOutPortIds_(this) ((IS_82ABD8) &(this)->eventOutPortIds)

B t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__eq(t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this, t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints other);
inline B t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__ne(t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this, t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints other) {
  return !t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__eq(this, other);
};
void t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_string_(STACK_FRAME String result, t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this);
void t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_cprint(t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this, B isOut);

inline B t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__is(STACK_FRAME void* this) {
  return ((t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints) this)->type == Tt_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints;
}

inline t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__as(STACK_FRAME void *this) {
  if (t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints__is(CALLER this)) return (t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints) this;
  sfAbortImpl(CALLER "Invalid cast to t.TemperatureControl.Fan_i_fp_fan_Bridge.EntryPoints.");
  abort();
}

void t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_apply(STACK_FRAME t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this, Z Fan_i_fp_fan_BridgeId, Z fanCmd_Id, Z fanAck_Id, Option_9AF35E dispatchTriggers, t_TemperatureControl_Fan_i_Initialization_Api initialization_api, t_TemperatureControl_Fan_i_Operational_Api operational_api);

Unit t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_initialise_(STACK_FRAME t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this);

void t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_filter_(STACK_FRAME IS_82ABD8 result, t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this, IS_82ABD8 receivedEvents, IS_82ABD8 triggers);

Unit t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_compute_(STACK_FRAME t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this);

Unit t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints_finalise_(STACK_FRAME t_TemperatureControl_Fan_i_fp_fan_Bridge_EntryPoints this);

#ifdef __cplusplus
}
#endif

#endif