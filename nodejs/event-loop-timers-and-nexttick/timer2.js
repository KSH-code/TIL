const fs = require('fs')
function someAsyncOperation(callback) {
  // 이 작업이 완료되는데 0 ~ 2ms가 걸린다고 가정합니다.
  fs.readdir('/', callback);
}

const timeoutScheduled = Date.now();

setTimeout(() => {
  const delay = Date.now() - timeoutScheduled;

  console.log(`${delay}ms have passed since I was scheduled`);
}, 0);


// 완료하는데 1000ms가 걸리는 someAsyncOperation를 실행합니다.
someAsyncOperation(() => {
  const startCallback = Date.now();

  // 1000ms가 걸릴 어떤 작업을 합니다.
  while (Date.now() - startCallback < 1000) {
    // 아무것도 하지 않습니다.
  }
});