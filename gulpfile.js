
var gulp = require('gulp');
var sass = require('gulp-sass');
sass.compiler = require('node-sass');


gulp.task('sass', function () {
    return gulp.src('./src/main/webapp/sass/**/*.scss')
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest('./src/main/webapp/css'));
});

gulp.task('sass:watch', function () {
    gulp.watch('./src/main/webapp/sass/**/*.scss', ['sass']);
});


gulp.task('default', ['sass']);
gulp.task('build', ['sass']);