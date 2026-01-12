const path = require('path'); // CommonJS

module.exports = {
  mode: 'development',
  entry: './frontend/main.js',
  output: {
    path: __dirname + '/public/assets/js',
    filename: 'bundle.js'
  },
  target: ['web', 'es5'],
  module: {
    rules: [
      {
        test: /\.js$/,
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['@babel/preset-env']
          }
        }
      },
      {
      test: /\.css$/,
      use: ['style-loader', 'css-loader']
      }
    ]
  },
  devtool: 'source-map'
};