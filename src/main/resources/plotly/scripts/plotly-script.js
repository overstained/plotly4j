function plotConfig(config) {
	TESTER = document.getElementById('plot-area');
	parsedConfig = JSON.parse(config);
	TESTER.style.width = parsedConfig.layout.width + 'px';
	TESTER.style.height = parsedConfig.layout.height + 'px';
	if(TESTER) {
		Plotly.plot( TESTER, parsedConfig, {} , {
			modeBarButtonsToRemove: []
		});
	}
}