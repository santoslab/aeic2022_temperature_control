// #Sireum

package t

import org.sireum._
import t._

@msig trait PlatformConfig {
  def setup(): Unit
}

object AppPlatform {

  def setup(config: PlatformConfig): Unit = {
    t.TemperatureControl.TempSensor_i_tsp_tempSensor_EntryPoints.impl = TempSensor_i_tsp_tempSensor_EntryPointsImpl()
    t.TemperatureControl.TempControl_i_tcp_tempControl_EntryPoints.impl = TempControl_i_tcp_tempControl_EntryPointsImpl()
    t.TemperatureControl.Fan_i_fp_fan_EntryPoints.impl = Fan_i_fp_fan_EntryPointsImpl()

    config.setup()
  }

  @record class TempSensor_i_tsp_tempSensor_EntryPointsImpl extends t.TemperatureControl.TempSensor_i_tsp_tempSensor_EntryPointsSig {
    def timeTriggered(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.timeTriggered(api)
    }

    def activate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.activate(api)
    }

    def deactivate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.deactivate(api)
    }

    def finalise(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.finalise(api)
    }

    def initialise(api: t.TemperatureControl.TempSensor_i_Initialization_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.initialise(api)
    }

    def recover(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
      t.TemperatureControl.TempSensor_i_tsp_tempSensor.recover(api)
    }
  }


  @record class TempControl_i_tcp_tempControl_EntryPointsImpl extends t.TemperatureControl.TempControl_i_tcp_tempControl_EntryPointsSig {
    def handle_fanAck(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.FanAck.Type): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.handle_fanAck(api, value)
    }

    def handle_setPoint(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.SetPoint_i): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.handle_setPoint(api, value)
    }

    def handle_tempChanged(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.handle_tempChanged(api)
    }

    def activate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.activate(api)
    }

    def deactivate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.deactivate(api)
    }

    def finalise(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.finalise(api)
    }

    def initialise(api: t.TemperatureControl.TempControl_i_Initialization_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.initialise(api)
    }

    def recover(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
      t.TemperatureControl.TempControl_i_tcp_tempControl.recover(api)
    }
  }


  @record class Fan_i_fp_fan_EntryPointsImpl extends t.TemperatureControl.Fan_i_fp_fan_EntryPointsSig {
    def handle_fanCmd(api: t.TemperatureControl.Fan_i_Operational_Api, value : TemperatureControl.FanCmd.Type): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.handle_fanCmd(api, value)
    }

    def activate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.activate(api)
    }

    def deactivate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.deactivate(api)
    }

    def finalise(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.finalise(api)
    }

    def initialise(api: t.TemperatureControl.Fan_i_Initialization_Api): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.initialise(api)
    }

    def recover(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
      t.TemperatureControl.Fan_i_fp_fan.recover(api)
    }
  }

}
