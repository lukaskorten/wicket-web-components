const gulp = require('gulp');
const sass = require('gulp-sass');
const nodeSass = require('node-sass');
const webpack = require('webpack-stream');
const named = require('vinyl-named');

const resolveWorkDir = (path) => {
    return `./src/main/webapp/${path}`;
};

sass.compiler = nodeSass;

gulp.task('sass', () => {

    const srcFiles = resolveWorkDir('sass/**/*.scss');
    const targetDir = resolveWorkDir('css');

    return gulp.src(srcFiles)
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest(targetDir));
});

gulp.task('sass:watch', function () {
    gulp.watch(resolveWorkDir('sass/**/*.scss'), ['sass']);
});


gulp.task('package', () => {

    const entryFile = resolveWorkDir('js/index.js');
    const targetDir = resolveWorkDir('dist/js');
    const webpackConfig = {
        devtool: 'source-map',
        mode: 'development'
    };

    return gulp.src(entryFile)
        .pipe(named())
        .pipe(webpack(webpackConfig))
        .pipe(gulp.dest(targetDir));
});


gulp.task('default', ['sass', 'package']);
gulp.task('build', ['sass', 'package']);