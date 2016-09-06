<#include "../include/imports.ftl">

<style>

  .three-cols-ul {
    list-style: none;
    padding: 0;
    margin: 0;

  }

  .three-cols-ul li {
    display: inline-block;
    vertical-align: top;
  }
  .three-cols-ul li{
    min-width:33%;
    margin:10px;
  }
</style>

<div style="background-color: ${info.backgroundColor};padding:${info.padding}">
  <ul class="three-cols-ul">
    <li class="left">
    <@hst.include ref="left"/>
    </li>
    <li class="center">
    <@hst.include ref="center"/>
    </li>
    <li class="right">
    <@hst.include ref="right"/>
    </li>
  </ul>

</div>
