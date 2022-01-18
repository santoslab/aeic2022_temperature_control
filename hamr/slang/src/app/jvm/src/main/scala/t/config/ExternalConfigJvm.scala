package t.config

import org.sireum._
import art.scheduling.roundrobin.RoundRobinJvmInterface
import art.scheduling.roundrobin.RoundRobinExtensions_Ext

object ExternalConfigJvm {
  def setup(): Unit = {
    RoundRobinExtensions_Ext.roundRobinInterface = new RoundRobinJvmInterface()
  }
}
