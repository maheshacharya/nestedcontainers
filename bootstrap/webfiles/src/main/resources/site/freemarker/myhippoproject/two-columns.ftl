<#include "../include/imports.ftl">

<style>

  .two-cols-ul {
    list-style: none;
    padding: 0;
    margin: 0;

  }

  .two-cols-ul li {
    display: inline-block;
    vertical-align: top;
  }
  .two-cols-ul li.left{
    width:50%;
  }
  .two-cols-ul li.right{
    width:49%;
  }
</style>

<div style="background-color: ${info.backgroundColor};padding:${info.padding}">
  <ul class="two-cols-ul">
    <li class="left">
    <@hst.include ref="left"/>
    </li>
    <li class="right">
    <@hst.include ref="right"/>
    </li>
  </ul>

</div>
