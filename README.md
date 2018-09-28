**Java wrapper for Plotly.js**

---

## Example

```
			Chart.show(ChartConfig
				.define()
				.data(ScatterDataConfig
						.define()
						.x(asList(1,2,3))
						.y(asList(1,2,4))
						.name("plot")
						.opacity(0.5)
						.modes(Mode.TEXT, Mode.LINES))
				.layout(LayoutConfig
					  .define()
					  .title("Line")
					  .width(800)
					  .height(600)));
```