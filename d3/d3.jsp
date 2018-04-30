<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/inc/common.jsp" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>d3 test</title>
	
	<script src="http://d3js.org/d3.v3.min.js"></script>
	<script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
	<style>

body {
  font: 10px sans-serif;
}

.axis path,
.axis line {
  fill: none;
  stroke: #000;
  shape-rendering: crispEdges;
}

.bar {
  fill: orange;
}

.bar:hover {
  fill: orangered ;
}

.x.axis path {
  display: none;
}

.d3-tip {
  line-height: 1;
  font-weight: bold;
  padding: 12px;
  background: rgba(0, 0, 0, 0.8);
  color: #fff;
  border-radius: 2px;
}

/* Creates a small triangle extender for the tooltip */
.d3-tip:after {
  box-sizing: border-box;
  display: inline;
  font-size: 10px;
  width: 100%;
  line-height: 1;
  color: rgba(0, 0, 0, 0.8);
  content: "\25BC";
  position: absolute;
  text-align: center;
}

/* Style northward tooltips differently */
.d3-tip.n:after {
  margin: -1px 0 0 0;
  top: 100%;
  left: 0;
}
</style>
</head>
<body>
	<h1>d3 test</h1>
	<hr>
	
	<div id="chart" style="width:500px; height:300px"></div>
	
	
	<script>

	var margin = {top: 40, right: 20, bottom: 30, left: 40},
	    width = 500 - margin.left - margin.right,
	    height = 300 - margin.top - margin.bottom;
	
	var formatPercent = d3.format("9,999");
	
	var x = d3.scale.ordinal()
	    .rangeRoundBands([0, width], .1);
	
	var y = d3.scale.linear()
	    .range([height, 0]);
	
	var xAxis = d3.svg.axis()
	    .scale(x)
	    .orient("bottom");
	
	var yAxis = d3.svg.axis()
	    .scale(y)
	    .orient("left")
	    .tickFormat(formatPercent);
	
	var tip = d3.tip()
	  .attr('class', 'd3-tip')
	  .offset([-10, 0])
	  .html(function(d) {
	    return "<strong>Frequency:</strong> <span style='color:red'>" + d.cnt + "</span>";
	  })
	
	var svg = d3.select("#chart").append("svg")
	    .attr("width", width + margin.left + margin.right)
	    .attr("height", height + margin.top + margin.bottom)
	  .append("g")
	    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
	
	svg.call(tip);
	
	// d3.json("[json형식으로 내려보내줄 url]", function(error, data)
	d3.tsv("data.tsv", type, function(error, data) {
	  x.domain(data.map(function(d) { return d.dt; }));
	  y.domain([0, d3.max(data, function(d) { return d.cnt; })]);
	
	  svg.append("g")
	      .attr("class", "x axis")
	      .attr("transform", "translate(0," + height + ")")
	      .call(xAxis);
	
	  svg.append("g")
	      .attr("class", "y axis")
	      .call(yAxis)
	    .append("text")
	      .attr("transform", "rotate(-90)")
	      .attr("y", 6)
	      .attr("dy", ".71em")
	      .style("text-anchor", "end")
	      .text("Frequency");
	
	  svg.selectAll(".bar")
	      .data(data)
	    .enter().append("rect")
	      .attr("class", "bar")
	      .attr("x", function(d) { return x(d.dt); })
	      .attr("width", x.rangeBand())
	      .attr("y", function(d) { return y(d.cnt); })
	      .attr("height", function(d) { return height - y(d.cnt); })
	      .on('mouseover', tip.show)
	      .on('mouseout', tip.hide)
	
	});
	
	function type(d) {
	  d.cnt = +d.cnt;
	  return d;
	}
	
	</script>
	
</body>
</html>
