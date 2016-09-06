<#include "../include/imports.ftl">

<style>

  .three-rows-ul {
    list-style: none;
    padding: 0;
    margin: 0;

  }

.three-rows-ul li{
  min-height: 20px;

}
</style>

<div style="background-color: ${info.backgroundColor};padding:${info.padding}">
  <ul class="three-rows-ul">
    <li class="top" style="min-height: 20px;">
    <@hst.include ref="top"/>
    </li>
    <li class="center" style="min-height: 20px;">
    <@hst.include ref="center"/>
    </li>
    <li class="right" style="min-height: 20px;">
    <@hst.include ref="bottom"/>
    </li>
  </ul>

</div>
