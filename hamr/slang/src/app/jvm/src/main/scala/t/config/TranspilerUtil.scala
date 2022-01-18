// #Sireum

package t.config

import org.sireum._
import art.DataContent
import t._

object TranspilerUtil {
  def touch(): Unit = {
    if(F) {
      TranspilerToucher.touch()

      // add types used in Platform.receive and Platform.receiveAsync
      val mbox2Boolean_Payload: MBox2[art.Art.PortId, DataContent] = MBox2(0, Base_Types.Boolean_Payload(T))
      val mbox2OptionDataContent: MBox2[art.Art.PortId, Option[DataContent]] = MBox2(0, None())

      // touch process/thread timing properties
      println(Schedulers.TempControlSystem_i_Instance_t_processor_timingProperties)
      println(Schedulers.TempControlSystem_i_Instance_tsp_tempSensor_timingProperties)
      println(Schedulers.TempControlSystem_i_Instance_tcp_tempControl_timingProperties)
      println(Schedulers.TempControlSystem_i_Instance_fp_fan_timingProperties)

      // touch each payload/type in case some are only used as a field in a record
      def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

      printDataContent(Base_Types.Float_32_Payload(Base_Types.Float_32_example()))
      printDataContent(TemperatureControl.TempUnit_Payload(TemperatureControl.TempUnit.byOrdinal(0).get))
      printDataContent(TemperatureControl.Temperature_i_Payload(TemperatureControl.Temperature_i.example()))
      printDataContent(TemperatureControl.SetPoint_i_Payload(TemperatureControl.SetPoint_i.example()))
      printDataContent(TemperatureControl.FanAck_Payload(TemperatureControl.FanAck.byOrdinal(0).get))
      printDataContent(TemperatureControl.FanCmd_Payload(TemperatureControl.FanCmd.byOrdinal(0).get))
      printDataContent(art.Empty())

      {
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_initialization_api.get.logInfo("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_initialization_api.get.logDebug("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_initialization_api.get.logError("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_operational_api.get.logInfo("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_operational_api.get.logDebug("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_operational_api.get.logError("")
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_initialization_api.get.put_currentTemp(TemperatureControl.Temperature_i.example())
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_operational_api.get.put_currentTemp(TemperatureControl.Temperature_i.example())
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_initialization_api.get.put_tempChanged()
        t.TemperatureControl.TempSensor_i_tsp_tempSensor_Bridge.c_operational_api.get.put_tempChanged()
      }
      {
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logInfo("")
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logDebug("")
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logError("")
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logInfo("")
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logDebug("")
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logError("")
        val apiUsage_currentTemp: Option[TemperatureControl.Temperature_i] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_currentTemp()
        val apiUsage_fanAck: Option[TemperatureControl.FanAck.Type] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_fanAck()
        val apiUsage_setPoint: Option[TemperatureControl.SetPoint_i] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_setPoint()
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.put_fanCmd(TemperatureControl.FanCmd.byOrdinal(0).get)
        t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.put_fanCmd(TemperatureControl.FanCmd.byOrdinal(0).get)
        val apiUsage_tempChanged: Option[art.Empty] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_tempChanged()
      }
      {
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_initialization_api.get.logInfo("")
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_initialization_api.get.logDebug("")
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_initialization_api.get.logError("")
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_operational_api.get.logInfo("")
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_operational_api.get.logDebug("")
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_operational_api.get.logError("")
        val apiUsage_fanCmd: Option[TemperatureControl.FanCmd.Type] = t.TemperatureControl.Fan_i_fp_fan_Bridge.c_operational_api.get.get_fanCmd()
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_initialization_api.get.put_fanAck(TemperatureControl.FanAck.byOrdinal(0).get)
        t.TemperatureControl.Fan_i_fp_fan_Bridge.c_operational_api.get.put_fanAck(TemperatureControl.FanAck.byOrdinal(0).get)
      }
    }
  }
}
